package defpackage;

import com.android.chrome.R;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4353cq {
    /* JADX WARN: Type inference failed for: r0v0, types: [aq] */
    public static void a(final Callback callback, final C0180Bk c0180Bk, final boolean z) {
        ?? r0 = new InterfaceC11646y40() { // from class: aq
            @Override // defpackage.InterfaceC11646y40
            public final void accept(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Callback callback2 = Callback.this;
                if (booleanValue) {
                    C4353cq.a(callback2, c0180Bk, z);
                } else {
                    callback2.onResult(null);
                }
            }
        };
        c0180Bk.getClass();
        DY1 dy1 = new DY1(new C11871yk(c0180Bk), R.string.f67880_resource_name_obfuscated_res_0x7f14020c, new C12214zk(r0));
        final C0050Ak c0050Ak = new C0050Ak(dy1);
        if (z) {
            dy1.b();
        }
        AbstractC3194Yp.a.d(new InterfaceC2401Sm1() { // from class: bq
            @Override // defpackage.InterfaceC2401Sm1
            public final void a(boolean z2) {
                Callback callback2 = Callback.this;
                if (z2) {
                    AbstractC3194Yp.a();
                    callback2.onResult(null);
                } else if (z) {
                    c0050Ak.a.a();
                } else {
                    callback2.onResult(null);
                }
            }
        });
    }
}
