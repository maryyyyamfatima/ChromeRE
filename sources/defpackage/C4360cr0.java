package defpackage;

import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cr0 */
/* loaded from: classes.dex */
public final class C4360cr0 extends AbstractC4815eA0 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ C6161i50 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ C4703dr0 i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    @Override // defpackage.AbstractC4815eA0, defpackage.LC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4360cr0.l():void");
    }

    public C4360cr0(C4703dr0 c4703dr0, Intent intent, C6161i50 c6161i50, boolean z) {
        this.i = c4703dr0;
        this.a = intent;
        this.g = c6161i50;
        this.h = z;
    }

    @Override // defpackage.AbstractC4815eA0, defpackage.LC
    public final boolean W() {
        if (AbstractC8531oz1.b(this.g)) {
            return !"org.chromium.chrome.browser.download.DOWNLOAD_OPEN".equals(this.a.getAction());
        }
        return false;
    }
}
