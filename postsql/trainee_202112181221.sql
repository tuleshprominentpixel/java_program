-- public.trainee definition

-- Drop table

-- DROP TABLE public.trainee;

CREATE TABLE public.trainee (
	trainee_id serial4 NOT NULL,
	trainee_name varchar(55) NULL,
	trainee_address varchar(55) NULL,
	trainee_dob date NULL,
	trainee_joining_date date NULL,
	trainee_age int4 NULL,
	CONSTRAINT trainee_pkey PRIMARY KEY (trainee_id)
);

INSERT INTO public.trainee (trainee_name,trainee_address,trainee_dob,trainee_joining_date,trainee_age) VALUES
	 ('shhn','y1','2001-10-17','2021-10-17',21),
	 ('x2','y2','2001-10-18','2021-10-15',22),
	 ('x3','y3','2001-10-19','2021-10-14',23),
	 ('x4','y4','2001-10-10','2021-10-19',19);
