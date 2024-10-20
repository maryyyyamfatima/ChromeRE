package org.chromium.chrome.browser.vr;

import defpackage.InterfaceC7458ls;
import defpackage.InterfaceC7697ma2;
import org.chromium.components.webxr.ArCoreJavaUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ArDelegateImpl implements InterfaceC7458ls {
    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        ArCoreJavaUtils arCoreJavaUtils = ArCoreJavaUtils.c;
        if (arCoreJavaUtils != null) {
            arCoreJavaUtils.endSession();
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return ArCoreJavaUtils.d;
    }
}
