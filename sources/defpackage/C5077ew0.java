package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ew0 */
/* loaded from: classes.dex */
public final class C5077ew0 extends TZ {
    public C5765gw0 i;
    public final String[] j = {"commandResolver", "conversionContext", "editableTextType", "logger", "onBlurCommandFuture", "onChangeCommandFuture", "onClearCommandFuture", "onFocusCommandFuture", "onTextInputActionCommandFuture", "styleRunExtensionConverters", "typefaceProvider"};
    public final BitSet k = new BitSet(11);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (C5765gw0) wz;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(11, this.k, this.j);
        return this.i;
    }
}
