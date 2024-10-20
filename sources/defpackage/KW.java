package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.embedder_support.delegate.ColorPickerAdvanced;
import org.chromium.components.embedder_support.delegate.ColorPickerSimple;
import org.chromium.components.embedder_support.delegate.ColorSuggestion;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class KW extends AlertDialog implements InterfaceC1183Jc2 {
    public final ColorPickerAdvanced a;
    public final Button g;
    public final View h;
    public final View i;
    public final InterfaceC1183Jc2 j;
    public final int k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KW(Context context, C12134zW c12134zW, int i, ColorSuggestion[] colorSuggestionArr) {
        super(context, 0);
        this.j = c12134zW;
        this.k = i;
        this.l = i;
        View a = AbstractC3236Yx1.a(R.layout.f56470_resource_name_obfuscated_res_0x7f0e008f, context, null);
        setCustomTitle(a);
        this.i = a.findViewById(R.id.selected_color_view);
        ((TextView) a.findViewById(R.id.title)).setText(R.string.f70870_resource_name_obfuscated_res_0x7f140375);
        setButton(-1, context.getString(R.string.f70840_resource_name_obfuscated_res_0x7f140372), new GW(this));
        setButton(-2, context.getString(R.string.f70780_resource_name_obfuscated_res_0x7f14036c), new HW(this));
        setOnCancelListener(new IW(this));
        View a2 = AbstractC3236Yx1.a(R.layout.f56460_resource_name_obfuscated_res_0x7f0e008e, context, null);
        this.h = a2;
        setView(a2);
        Button button = (Button) a2.findViewById(R.id.more_colors_button);
        this.g = button;
        button.setOnClickListener(new JW(this));
        ColorPickerAdvanced colorPickerAdvanced = (ColorPickerAdvanced) a2.findViewById(R.id.color_picker_advanced);
        this.a = colorPickerAdvanced;
        colorPickerAdvanced.setVisibility(8);
        ColorPickerSimple colorPickerSimple = (ColorPickerSimple) a2.findViewById(R.id.color_picker_simple);
        colorPickerSimple.a = this;
        if (colorSuggestionArr == null) {
            colorSuggestionArr = new ColorSuggestion[8];
            for (int i2 = 0; i2 < 8; i2++) {
                colorSuggestionArr[i2] = new ColorSuggestion(ColorPickerSimple.g[i2], colorPickerSimple.getContext().getString(ColorPickerSimple.h[i2]));
            }
        }
        ViewOnClickListenerC3555aX viewOnClickListenerC3555aX = new ViewOnClickListenerC3555aX(colorPickerSimple.getContext(), colorSuggestionArr);
        viewOnClickListenerC3555aX.h = colorPickerSimple;
        colorPickerSimple.setAdapter((ListAdapter) viewOnClickListenerC3555aX);
        colorPickerSimple.setAccessibilityDelegate(new LW());
        int i3 = this.k;
        this.l = i3;
        View view = this.i;
        if (view != null) {
            view.setBackgroundColor(i3);
        }
    }

    @Override // defpackage.InterfaceC1183Jc2
    public final void a(int i) {
        this.l = i;
        View view = this.i;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }
}
