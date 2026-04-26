OUT = bin
PREFIX = br.edu.fatecpg.polimorfismo

all:
	javac -d $(OUT) $(shell find . -name "*.java")

_build_ex%:
	javac -d $(OUT) $(shell find . -path "*/ex$*/*.java")

# ex% : _build_ex%
# Work in progress