CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE IF NOT EXISTS weeks (
    week_id UUID PRIMARY KEY DEFAULT gen_random_uuid()
);

CREATE TABLE IF NOT EXISTS days (
    day_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    week_id UUID NOT NULL,
    day_of_week SMALLINT NOT NULL,
    CONSTRAINT fk_days_week
        FOREIGN KEY (week_id) REFERENCES weeks (week_id) ON DELETE CASCADE,
    CONSTRAINT chk_days_day_of_week
        CHECK (day_of_week BETWEEN 1 AND 7),
    CONSTRAINT uq_days_week_day
        UNIQUE (week_id, day_of_week)
);

CREATE TABLE IF NOT EXISTS muscles (
    muscle_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    muscle_type VARCHAR(100) NOT NULL,
    muscle_group VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS exercises (
    exercise_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    muscle_id UUID NOT NULL,
    exercise_name VARCHAR(150) NOT NULL,
    CONSTRAINT fk_exercises_muscle
        FOREIGN KEY (muscle_id) REFERENCES muscles (muscle_id) ON DELETE CASCADE,
    CONSTRAINT uq_exercises_muscle
        UNIQUE (muscle_id)
);

CREATE TABLE IF NOT EXISTS sessions (
    session_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    day_id UUID NOT NULL,
    muscle_id UUID NOT NULL,
    CONSTRAINT fk_sessions_day
        FOREIGN KEY (day_id) REFERENCES days (day_id) ON DELETE CASCADE,
    CONSTRAINT fk_sessions_muscle
        FOREIGN KEY (muscle_id) REFERENCES muscles (muscle_id)
);
