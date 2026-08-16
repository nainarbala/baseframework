-- Sample init script executed when DB first created
CREATE TABLE IF NOT EXISTS public.example (
  id serial primary key,
  name text NOT NULL
);
