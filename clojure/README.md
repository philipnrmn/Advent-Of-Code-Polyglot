# Clojure

Solutions to the 2015 [Advent of Code](http://adventofcode.com/) written in
Clojure.

## Usage

Ensure that you have [leiningen](http://leiningen.org/) installed.

Then from the `clojure` directory (same as this README), try running the tests:

```
$ lein test
```

You can run the actual tasks by using `lein exec` on the relevant file. E.g. to
try the input `(((` out on the code from day 1 part 1 you would enter:

```
$ lein exec 01/part1.clj "((("
3
```

Note that `lein exec` is a plugin which makes it possible to run `.clj` files
like shell scripts. The conventional method is to pass the namespace into 
`lein run` like this:

```
$ lein run -m advent-of-code.day1.part1 "((("
3
```

Of course, you can also call it directly from the repl:

```
$ lein repl
advent-of-code.core=> (use 'advent-of-code.day1.part1)
nil
advent-of-code.core=> (find-right-floor "(((")
3
```

## Directory structure

In order to respect the conventions of the project and also keep the build
working smoothly, the source files are named `day-num/part#.clj` and symlinked
into `src/advent-of-code` where leiningen expects to find them.

## Contributors

| Day | Part | Contributor |
| --: | ---: | ----------- |
| Nothing here yet...      |
