package j$.util.function;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes3.dex */
public interface BiConsumer<T, U> {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {
        public final /* synthetic */ java.util.function.BiConsumer wrappedValue;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.wrappedValue = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return new VivifiedWrapper(biConsumer);
        }

        @Override // j$.util.function.BiConsumer
        public /* synthetic */ void accept(Object obj, Object obj2) {
            this.wrappedValue.accept(obj, obj2);
        }

        public /* synthetic */ boolean equals(Object obj) {
            java.util.function.BiConsumer biConsumer = this.wrappedValue;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).wrappedValue;
            }
            return biConsumer.equals(obj);
        }

        public /* synthetic */ int hashCode() {
            return this.wrappedValue.hashCode();
        }
    }

    void accept(Object obj, Object obj2);
}
