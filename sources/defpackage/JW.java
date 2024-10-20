package defpackage;

import android.graphics.Color;
import android.view.View;
import com.android.chrome.R;
import org.chromium.components.embedder_support.delegate.ColorPickerAdvanced;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class JW implements View.OnClickListener {
    public final /* synthetic */ KW a;

    public JW(KW kw) {
        this.a = kw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        KW kw = this.a;
        kw.g.setVisibility(8);
        kw.findViewById(R.id.color_picker_simple).setVisibility(8);
        ColorPickerAdvanced colorPickerAdvanced = kw.a;
        colorPickerAdvanced.setVisibility(0);
        colorPickerAdvanced.i = kw;
        int i = kw.l;
        colorPickerAdvanced.j = i;
        Color.colorToHSV(i, colorPickerAdvanced.k);
        colorPickerAdvanced.b();
    }
}
