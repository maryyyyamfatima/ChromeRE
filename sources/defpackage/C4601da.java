package defpackage;

import org.chromium.content.browser.androidoverlay.AndroidOverlayProviderImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: da, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4601da implements InterfaceC8474op1 {
    public static AndroidOverlayProviderImpl a;

    @Override // defpackage.InterfaceC8474op1
    public final InterfaceC7786mp1 a() {
        if (a == null) {
            a = new AndroidOverlayProviderImpl();
        }
        return a;
    }
}
