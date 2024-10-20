package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ByteStoreConfig;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import defpackage.AbstractC9095qe2;
import defpackage.C1870Ok0;
import defpackage.C5155f92;
import defpackage.EnumC7791mq0;
import defpackage.InterfaceC9277r92;
import defpackage.KF;
import defpackage.OF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ok0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1870Ok0 implements InterfaceC9790sg0 {
    public final InterfaceC0209Bp3 a = AbstractC0729Fp3.a(new InterfaceC0209Bp3() { // from class: Nk0
        @Override // defpackage.InterfaceC0209Bp3
        public final Object get() {
            AbstractC0901Gy0.a();
            ByteStore create = ByteStore.create(new ByteStoreConfig());
            if (create != null) {
                return create;
            }
            throw new C10239ty0("Error creating Elements ByteStore.");
        }
    });

    @Override // defpackage.InterfaceC9790sg0
    public final void b(String str, byte[] bArr) {
        c(str, bArr);
    }

    public final void c(String str, byte[] bArr) {
        ((ByteStore) this.a.get()).set(str, bArr);
    }

    @Override // defpackage.InterfaceC9790sg0
    public final void remove(String str) {
        ((ByteStore) this.a.get()).set(str, null);
    }

    @Override // defpackage.InterfaceC9790sg0
    public final C5499g92 a(final String str) {
        final ByteStore byteStore = (ByteStore) this.a.get();
        return new C5499g92(new T92() { // from class: com.google.android.libraries.elements.converters.templates.datastore.a
            @Override // defpackage.T92
            public final void a(C5155f92 c5155f92) {
                C1870Ok0 c1870Ok0 = C1870Ok0.this;
                c1870Ok0.getClass();
                String str2 = str;
                Observer observer = new Observer(c1870Ok0, c5155f92, str2) { // from class: com.google.android.libraries.elements.converters.templates.datastore.DefaultStore$1
                    final /* synthetic */ InterfaceC9277r92 val$emitter;
                    final /* synthetic */ String val$key;

                    {
                        this.val$emitter = c5155f92;
                        this.val$key = str2;
                    }

                    @Override // com.google.android.libraries.elements.interfaces.Observer
                    public void storeDidUpdate(ByteStore byteStore2, TransactionRecord transactionRecord) {
                        Snapshot endState;
                        if (transactionRecord == null || (endState = transactionRecord.endState()) == null) {
                            return;
                        }
                        ((C5155f92) this.val$emitter).c(AbstractC9095qe2.a(endState.find(this.val$key)));
                    }
                };
                ByteStore byteStore2 = byteStore;
                final Subscription subscribe = byteStore2.subscribe(str2, observer);
                if (subscribe != null) {
                    EnumC7791mq0.e(c5155f92, new OF(new KF() { // from class: Mk0
                        @Override // defpackage.KF
                        public final void cancel() {
                            Subscription.this.cancel();
                        }
                    }));
                }
                Snapshot snapshot = byteStore2.snapshot();
                if (snapshot != null) {
                    c5155f92.c(AbstractC9095qe2.a(snapshot.find(str2)));
                }
            }
        });
    }
}
