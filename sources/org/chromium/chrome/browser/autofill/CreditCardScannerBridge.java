package org.chromium.chrome.browser.autofill;

import J.N;
import defpackage.C0916Hb0;
import defpackage.C1176Jb0;
import defpackage.InterfaceC0786Gb0;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CreditCardScannerBridge implements InterfaceC0786Gb0 {
    public final long a;
    public final C0916Hb0 b;

    public static CreditCardScannerBridge create(long j, WebContents webContents) {
        return new CreditCardScannerBridge(j, webContents);
    }

    public CreditCardScannerBridge(long j, WebContents webContents) {
        C0916Hb0 c0916Hb0;
        this.a = j;
        if (C0916Hb0.h != null) {
            c0916Hb0 = new C1176Jb0(webContents, this);
        } else {
            c0916Hb0 = new C0916Hb0(webContents, this);
        }
        this.b = c0916Hb0;
    }

    public final boolean canScan() {
        return this.b.a();
    }

    public final void scan() {
        this.b.c();
    }

    @Override // defpackage.InterfaceC0786Gb0
    public final void b(int i, int i2, String str) {
        N.Md35y73f(this.a, this, "", str, i, i2);
    }

    @Override // defpackage.InterfaceC0786Gb0
    public final void a() {
        N.MzlSwhwH(this.a, this);
    }
}
