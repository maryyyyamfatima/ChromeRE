package defpackage;

import android.util.SparseIntArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rz */
/* loaded from: classes.dex */
public final class C9557rz {
    public final C9900sz a;
    public final InterfaceC7205l72 b;
    public final SparseIntArray d = new SparseIntArray();
    public final Q83 c = O83.a;

    public C9557rz(C7549m72 c7549m72, C9900sz c9900sz) {
        this.a = c9900sz;
        this.b = c7549m72;
    }

    public final void a() {
        Q83 q83 = this.c;
        Set k = q83.k("Chrome.Bluetooth.NotificationIds", null);
        if (k == null) {
            return;
        }
        Iterator it = k.iterator();
        while (it.hasNext()) {
            ((C7549m72) this.b).a(Integer.parseInt((String) it.next()), "BluetoothNotificationManager");
        }
        q83.m("Chrome.Bluetooth.NotificationIds");
    }

    public final void c(int i, boolean z) {
        HashSet hashSet = new HashSet();
        Q83 q83 = this.c;
        HashSet hashSet2 = new HashSet(q83.k("Chrome.Bluetooth.NotificationIds", hashSet));
        if (z && !hashSet2.isEmpty() && hashSet2.contains(String.valueOf(i))) {
            hashSet2.remove(String.valueOf(i));
        } else if (!z) {
            hashSet2.add(String.valueOf(i));
        }
        q83.u("Chrome.Bluetooth.NotificationIds", hashSet2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r4, int r5, org.chromium.content_public.browser.WebContents r6, org.chromium.url.GURL r7, boolean r8) {
        /*
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L5
            goto L15
        L5:
            boolean r2 = J.N.MkAMKLD2(r6)
            if (r2 == 0) goto Ld
            r6 = 2
            goto L16
        Ld:
            boolean r6 = J.N.MkukzSD4(r6)
            if (r6 == 0) goto L15
            r6 = r0
            goto L16
        L15:
            r6 = r1
        L16:
            java.lang.String r2 = "WebBluetoothNewPermissionsBackend"
            boolean r2 = J.N.Mudil8Bg(r2)
            if (r2 != 0) goto L1f
            goto L3d
        L1f:
            if (r6 == 0) goto L22
            goto L3e
        L22:
            Q83 r0 = defpackage.O83.a
            java.lang.String r2 = "Chrome.Bluetooth.NotificationIds"
            r3 = 0
            java.util.Set r0 = r0.k(r2, r3)
            if (r0 == 0) goto L3d
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L34
            goto L3d
        L34:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            boolean r0 = r0.contains(r1)
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            return
        L41:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<org.chromium.chrome.browser.app.bluetooth.BluetoothNotificationService> r1 = org.chromium.chrome.browser.app.bluetooth.BluetoothNotificationService.class
            r0.<init>(r4, r1)
            java.lang.String r1 = "org.chromium.chrome.browser.app.bluetooth.BLUETOOTH_UPDATE"
            r0.setAction(r1)
            java.lang.String r1 = "NotificationId"
            r0.putExtra(r1, r5)
            java.lang.String r5 = "NotificationUrl"
            java.lang.String r7 = r7.i()
            r0.putExtra(r5, r7)
            java.lang.String r5 = "NotificationBluetoothType"
            r0.putExtra(r5, r6)
            java.lang.String r5 = "NotificationIsIncognito"
            r0.putExtra(r5, r8)
            r4.startService(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9557rz.b(android.content.Context, int, org.chromium.content_public.browser.WebContents, org.chromium.url.GURL, boolean):void");
    }
}
