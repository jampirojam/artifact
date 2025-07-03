--
-- PostgreSQL database dump
--

-- Dumped from database version 14.1
-- Dumped by pg_dump version 14.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: saldo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.saldo (
    id_saldo text NOT NULL,
    pemilik_saldo text NOT NULL,
    total_saldo double precision NOT NULL
);


ALTER TABLE public.saldo OWNER TO postgres;

--
-- Name: transaksi; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.transaksi (
    id text NOT NULL,
    nominal double precision NOT NULL,
    jenis text NOT NULL,
    id_saldo text NOT NULL,
    tanggal timestamp without time zone NOT NULL
);


ALTER TABLE public.transaksi OWNER TO postgres;

--
-- Data for Name: saldo; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.saldo (id_saldo, pemilik_saldo, total_saldo) FROM stdin;
ID-1	Budi	500000
ID-4	Salim	130000
ID-7	Al Masih	123000
ID-6	Suhada Slim	567000
ID-2	Pukudi	700000
\.


--
-- Data for Name: transaksi; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.transaksi (id, nominal, jenis, id_saldo, tanggal) FROM stdin;
TR-2	78000	Kredit	ID-1	2022-01-31 16:12:00.077
TR-4	13000	Kredit	ID-3	2022-01-31 16:13:14.025
TR-3	10000	Kredit	ID-3	2022-01-31 16:18:01.071
\.


--
-- Name: saldo saldo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.saldo
    ADD CONSTRAINT saldo_pkey PRIMARY KEY (id_saldo);


--
-- Name: transaksi transaksi_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transaksi
    ADD CONSTRAINT transaksi_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

