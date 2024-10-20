package j$.util.function;

import j$.util.function.BinaryOperator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes3.dex */
public interface BiFunction<T, U, R> {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {
        public final /* synthetic */ java.util.function.BiFunction wrappedValue;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.wrappedValue = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof java.util.function.BinaryOperator ? BinaryOperator.VivifiedWrapper.convert((java.util.function.BinaryOperator) biFunction) : new VivifiedWrapper(biFunction);
        }

        @Override // j$.util.function.BiFunction
        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.wrappedValue.apply(obj, obj2);
        }

        public /* synthetic */ boolean equals(Object obj) {
            java.util.function.BiFunction biFunction = this.wrappedValue;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).wrappedValue;
            }
            return biFunction.equals(obj);
        }

        public /* synthetic */ int hashCode() {
            return this.wrappedValue.hashCode();
        }
    }

    Object apply(Object obj, Object obj2);
}
