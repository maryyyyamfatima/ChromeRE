package defpackage;

import android.hardware.Camera;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SF2 implements Camera.ErrorCallback {
    public final /* synthetic */ UF2 a;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // android.hardware.Camera.ErrorCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onError(int r2, android.hardware.Camera r3) {
        /*
            r1 = this;
            r3 = 2
            if (r2 == r3) goto L16
            r3 = 100
            if (r2 == r3) goto L16
            switch(r2) {
                case 1000: goto L12;
                case 1001: goto Le;
                case 1002: goto L16;
                default: goto La;
            }
        La:
            r2 = 2132019479(0x7f140917, float:1.9677294E38)
            goto L19
        Le:
            r2 = 2132019474(0x7f140912, float:1.9677284E38)
            goto L19
        L12:
            r2 = 2132019481(0x7f140919, float:1.9677298E38)
            goto L19
        L16:
            r2 = 2132019480(0x7f140918, float:1.9677296E38)
        L19:
            UF2 r3 = r1.a
            CF r0 = r3.g
            if (r0 == 0) goto L25
            r0.b()
            r0 = 0
            r3.g = r0
        L25:
            android.content.Context r3 = r3.a
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r2 = r3.getString(r2)
            QF3 r3 = defpackage.AbstractC5103f04.a
            RF2 r0 = new RF2
            r0.<init>()
            org.chromium.base.task.PostTask.d(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SF2.onError(int, android.hardware.Camera):void");
    }

    public SF2(UF2 uf2) {
        this.a = uf2;
    }
}
