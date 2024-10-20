package org.chromium.content.browser;

import android.app.Activity;
import android.util.SparseArray;
import defpackage.C10191tp4;
import defpackage.C7531m42;
import org.chromium.content_public.browser.WebContents;
import org.chromium.device.nfc.NfcDelegate;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ContentNfcDelegate implements NfcDelegate {
    public static ContentNfcDelegate create() {
        return new ContentNfcDelegate();
    }

    @Override // org.chromium.device.nfc.NfcDelegate
    public final void a(int i) {
        SparseArray sparseArray = NfcHost.i;
        NfcHost nfcHost = (NfcHost) sparseArray.get(i);
        nfcHost.h = null;
        C10191tp4 e = C10191tp4.e(nfcHost.a);
        if (e != null) {
            e.a.d(nfcHost);
        }
        sparseArray.remove(nfcHost.g);
    }

    @Override // org.chromium.device.nfc.NfcDelegate
    public final void b(C7531m42 c7531m42, int i) {
        NfcHost nfcHost = (NfcHost) NfcHost.i.get(i);
        nfcHost.h = c7531m42;
        WebContents webContents = nfcHost.a;
        C10191tp4 e = C10191tp4.e(webContents);
        if (e != null) {
            e.b(nfcHost);
        }
        WindowAndroid Q0 = webContents.Q0();
        nfcHost.h.onResult(Q0 != null ? (Activity) Q0.k().get() : null);
    }
}
