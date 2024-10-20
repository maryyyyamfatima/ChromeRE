package defpackage;

import J.N;
import android.text.Editable;
import android.text.TextWatcher;
import org.chromium.chrome.browser.image_editor.text.TextEditModeView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class VH3 implements TextWatcher {
    public final /* synthetic */ TextEditModeView a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public VH3(TextEditModeView textEditModeView) {
        this.a = textEditModeView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        TextEditModeView textEditModeView = this.a;
        textEditModeView.getClass();
        boolean isEmpty = obj.isEmpty();
        textEditModeView.g.setText(isEmpty ? textEditModeView.a : obj);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("ScreenshotsForAndroidV2")) {
            float textSize = textEditModeView.g.getTextSize() * 0.04f;
            textEditModeView.g.setShadowLayer(textSize, textSize, textSize, -14013910);
        }
        textEditModeView.g.setGravity(isEmpty ? 17 : 8388611);
        textEditModeView.i.setVisibility(obj.length() > 0 ? 0 : 4);
    }
}
