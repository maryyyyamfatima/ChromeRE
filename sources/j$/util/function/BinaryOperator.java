package j$.util.function;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes3.dex */
public interface BinaryOperator extends BiFunction {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class VivifiedWrapper implements BinaryOperator {
        public final /* synthetic */ java.util.function.BinaryOperator wrappedValue;

        private /* synthetic */ VivifiedWrapper(java.util.function.BinaryOperator binaryOperator) {
            this.wrappedValue = binaryOperator;
        }

        public static /* synthetic */ BinaryOperator convert(java.util.function.BinaryOperator binaryOperator) {
            if (binaryOperator == null) {
                return null;
            }
            return new VivifiedWrapper(binaryOperator);
        }

        @Override // j$.util.function.BiFunction
        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.wrappedValue.apply(obj, obj2);
        }

        public /* synthetic */ boolean equals(Object obj) {
            java.util.function.BinaryOperator binaryOperator = this.wrappedValue;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).wrappedValue;
            }
            return binaryOperator.equals(obj);
        }

        public /* synthetic */ int hashCode() {
            return this.wrappedValue.hashCode();
        }
    }
}
