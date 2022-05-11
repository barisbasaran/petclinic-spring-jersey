CREATE TABLE IF NOT EXISTS pets
(
    id      SERIAL,
    name    TEXT    NOT NULL,
    age     INTEGER NOT NULL,
    species TEXT    NOT NULL
);
ALTER TABLE pets
    ADD UNIQUE (name);
