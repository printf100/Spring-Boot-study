DROP SEQUENCE MYNOSEQ;
DROP TABLE MYBOARD;

CREATE SQUENCE MYNOSEQ;
CREATE TABLE MYBOARD(
	MYNO NUMBER PRIMARY KEY,
	MYNAME VARCHAR2(1000) NOT NULL,
	MYTITLE VARCHAR2(2000) NOT NULL,
	MYCONTENT VARCHAR2(4000) NOT NULL,
	MYDATE DATE NOT NULL
);

INSERT INTO MYBOARD
VALUES (MYNOSEQ.NEXTVAL, 'ADMIN', 'TEST', 'TEST', SYSDATE)