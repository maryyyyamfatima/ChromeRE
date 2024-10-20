package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iw0 */
/* loaded from: classes.dex */
public final class C6451iw0 extends TZ {
    public C7139kw0 i;
    public final String[] j = {"commandResolver", "conversionContext", "editableTextType", "enableEmojiCompat", "lazyInitEmojiCompat", "logger", "onBlurCommandFuture", "onChangeCommandFuture", "onClearCommandFuture", "onFocusCommandFuture", "onTextInputActionCommandFuture", "styleRunExtensionConverters", "typefaceProvider"};
    public final BitSet k = new BitSet(13);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (C7139kw0) wz;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(13, this.k, this.j);
        return this.i;
    }
}
