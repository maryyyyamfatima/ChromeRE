package defpackage;

import J.N;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.state.LevelDBPersistedDataStorage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nA1 */
/* loaded from: classes.dex */
public final class C7910nA1 implements InterfaceC7805ms2 {
    public final LevelDBPersistedDataStorage a;

    @Override // defpackage.InterfaceC7805ms2
    public final InterfaceC7461ls2 c(int i, String str) {
        return null;
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void d(int i, String str, C3809bF c3809bF) {
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void g(int i, String str, C4025bs2 c4025bs2, Callback callback) {
    }

    public C7910nA1(Profile profile) {
        this.a = new LevelDBPersistedDataStorage(profile);
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void f(int i, String str, C4025bs2 c4025bs2) {
        byte[] bArr;
        c4025bs2.a();
        String h = h(i, str);
        ByteBuffer byteBuffer = c4025bs2.get();
        if (byteBuffer == null) {
            bArr = null;
        } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            bArr = byteBuffer.array();
        } else {
            byte[] bArr2 = new byte[byteBuffer.limit()];
            byteBuffer.rewind();
            byteBuffer.get(bArr2);
            bArr = bArr2;
        }
        LevelDBPersistedDataStorage levelDBPersistedDataStorage = this.a;
        N.MDiWNRLP(levelDBPersistedDataStorage.a, levelDBPersistedDataStorage.a(h), bArr, null);
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void b(int i, String str, final C2687Ur2 c2687Ur2) {
        String h = h(i, str);
        Callback callback = new Callback() { // from class: mA1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                byte[] bArr = (byte[]) obj;
                c2687Ur2.onResult(bArr == null ? null : ByteBuffer.wrap(bArr));
            }
        };
        LevelDBPersistedDataStorage levelDBPersistedDataStorage = this.a;
        N.MqUV_juQ(levelDBPersistedDataStorage.a, levelDBPersistedDataStorage.a(h), callback);
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void a(int i, String str) {
        String h = h(i, str);
        LevelDBPersistedDataStorage levelDBPersistedDataStorage = this.a;
        N.Mf_BEvgG(levelDBPersistedDataStorage.a, levelDBPersistedDataStorage.a(h), null);
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void e(String str, ArrayList arrayList) {
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = h(((Integer) arrayList.get(i)).intValue(), str);
        }
        LevelDBPersistedDataStorage levelDBPersistedDataStorage = this.a;
        long j = levelDBPersistedDataStorage.a;
        String[] strArr2 = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr2[i2] = levelDBPersistedDataStorage.a(strArr[i2]);
        }
        N.MQnSvNoI(j, strArr2, str, null);
    }

    public static final String h(int i, String str) {
        return String.format(Locale.US, "%d-%s", Integer.valueOf(i), str);
    }
}
