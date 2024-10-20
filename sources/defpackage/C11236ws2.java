package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.search.rendering.xuikit.runtime.persistentstore.PersistentByteStoreInstaller$PersistenceSubscription$observer$1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ws2 */
/* loaded from: classes.dex */
public final class C11236ws2 {
    public static final C6492j31 f = C6492j31.j();
    public final EnumC6432is4 a = EnumC6432is4.o;
    public final P90 b;
    public final C9596s52 c;
    public final Tr4 d;
    public final C1870Ok0 e;

    public C11236ws2(C1870Ok0 c1870Ok0, P90 p90, C9596s52 c9596s52, Tr4 tr4) {
        this.b = p90;
        this.c = c9596s52;
        this.d = tr4;
        this.e = c1870Ok0;
    }

    public final C10893vs2 a(C0743Fs2 c0743Fs2, String str) {
        AbstractC0087Ar1.e(c0743Fs2, "diskCache");
        AbstractC0087Ar1.e(str, "prefix");
        ByteStore byteStore = (ByteStore) this.e.a.get();
        AbstractC0087Ar1.d(byteStore, "defaultStore.getByteStore()");
        C10893vs2 c10893vs2 = new C10893vs2(this, byteStore, c0743Fs2, str);
        PersistentByteStoreInstaller$PersistenceSubscription$observer$1 persistentByteStoreInstaller$PersistenceSubscription$observer$1 = c10893vs2.n;
        ByteStore byteStore2 = c10893vs2.a;
        c10893vs2.i = byteStore2.subscribe(null, persistentByteStoreInstaller$PersistenceSubscription$observer$1);
        c10893vs2.j = byteStore2.subscribeToFaults(c10893vs2.o);
        return c10893vs2;
    }
}
