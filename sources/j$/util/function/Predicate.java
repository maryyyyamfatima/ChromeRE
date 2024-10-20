package j$.util.function;

import j$.util.Objects;
import j$.util.function.Predicate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes3.dex */
public interface Predicate<T> {
    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t);

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC<T> {
        /* JADX WARN: Generic types in debug info not equals: j$.util.function.Predicate != java.util.function.Predicate<? super T> */
        public static Predicate $default$and(final Predicate _this, final Predicate predicate) {
            Objects.requireNonNull(predicate);
            return new Predicate() { // from class: j$.util.function.Predicate$$ExternalSyntheticLambda2
                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return Predicate.CC.$default$and(this, predicate2);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate negate() {
                    return Predicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate or(Predicate predicate2) {
                    return Predicate.CC.$default$or(this, predicate2);
                }

                @Override // j$.util.function.Predicate
                public final boolean test(Object obj) {
                    return Predicate.CC.$private$lambda$and$0(Predicate.this, predicate, obj);
                }
            };
        }

        public static /* synthetic */ boolean $private$lambda$and$0(Predicate _this, Predicate other, Object t) {
            return _this.test(t) && other.test(t);
        }

        public static Predicate $default$negate(final Predicate _this) {
            return new Predicate() { // from class: j$.util.function.Predicate$$ExternalSyntheticLambda3
                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate.CC.$default$and(this, predicate);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate negate() {
                    return Predicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate.CC.$default$or(this, predicate);
                }

                @Override // j$.util.function.Predicate
                public final boolean test(Object obj) {
                    return Predicate.CC.$private$lambda$negate$1(Predicate.this, obj);
                }
            };
        }

        public static /* synthetic */ boolean $private$lambda$negate$1(Predicate _this, Object t) {
            return !_this.test(t);
        }

        /* JADX WARN: Generic types in debug info not equals: j$.util.function.Predicate != java.util.function.Predicate<? super T> */
        public static Predicate $default$or(final Predicate _this, final Predicate predicate) {
            Objects.requireNonNull(predicate);
            return new Predicate() { // from class: j$.util.function.Predicate$$ExternalSyntheticLambda4
                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return Predicate.CC.$default$and(this, predicate2);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate negate() {
                    return Predicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate or(Predicate predicate2) {
                    return Predicate.CC.$default$or(this, predicate2);
                }

                @Override // j$.util.function.Predicate
                public final boolean test(Object obj) {
                    return Predicate.CC.$private$lambda$or$2(Predicate.this, predicate, obj);
                }
            };
        }

        public static /* synthetic */ boolean $private$lambda$or$2(Predicate _this, Predicate other, Object t) {
            return _this.test(t) || other.test(t);
        }
    }
}
