package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9611s8 implements Callback {
    public final /* synthetic */ C9954t8 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C2210Ra0 c2210Ra0 = (C2210Ra0) obj;
        C9954t8 c9954t8 = this.a;
        c9954t8.b.k(AbstractC10640v8.a, false);
        N.MvNYgfef(((AllPasswordsBottomSheetBridge) c9954t8.a).a, c2210Ra0.a, c2210Ra0.b);
    }
}
