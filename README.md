# Scala Generics Type Erasure Bug

This repository demonstrates a common issue encountered when working with generics in Scala: type erasure.  Type erasure means that the specific type parameter (T in this example) is erased at runtime, leading to potential runtime errors or unexpected behavior if you rely on runtime type information.

**Problem:**

The `MyClass` class uses a generic type parameter `T`. However, due to type erasure,  the exact type of `T` is not available at runtime. This can cause problems if you need to perform operations that depend on the runtime type of `T`.

**Solution:**

The provided solution uses `Manifest` or `ClassTag` to provide runtime type information. This allows you to retain type information and avoid the pitfalls of type erasure.  This is particularly helpful in scenarios like serialization, reflection, or dynamic type checking.
