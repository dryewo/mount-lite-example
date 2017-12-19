# Example

Example of [mount-lite] 2.0.0 behavior when starting parts of the system.

Let's assume we have these states:

```
        +-- state1
        |
base <--+
        |
        +-- state2
```

`state1` and `state2` both depend on `base`, but not on one another.


According to [this docs section](http://www.functionalbytes.nl/mount-lite/03-start-stop-options.html),
mount-lite can start only the states that the specified state depends on:

```clj
(m/start #'state1)
; => [#'base #'state1]

(m/start #'state2)
; => [#'base #'state2]
```

In practice, however, the following happens: for one of the states the behavior is correct:
```clj
(m/start #'state1)
; => [#'base #'state1]
```
and for the other one all the states are started, even those not required:
```clj
(m/start #'state2)
; => [#'base #'state1 #'state2] ;; #'state1 shouldn't have been started 
```

[mount-lite]: https://github.com/aroemers/mount-lite
