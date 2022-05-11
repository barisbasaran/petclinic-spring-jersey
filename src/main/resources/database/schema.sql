CREATE TABLE IF NOT EXISTS pet
(
    id      SERIAL,
    name    TEXT    NOT NULL,
    age     INTEGER NOT NULL,
    species TEXT    NOT NULL
);
ALTER TABLE pet
    ADD UNIQUE (name);
