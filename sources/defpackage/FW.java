package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FW {
    public final View a;
    public final SeekBar b;
    public final GradientDrawable c;

    public FW(View view, int i, int i2, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.a = view.findViewById(R.id.gradient);
        ((TextView) view.findViewById(R.id.text)).setText(i);
        this.c = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.seek_bar);
        this.b = seekBar;
        seekBar.setOnSeekBarChangeListener(onSeekBarChangeListener);
        seekBar.setMax(i2);
        seekBar.setThumbOffset(AbstractC9771sd.c(view.getContext().getResources(), R.drawable.f45820_resource_name_obfuscated_res_0x7f090133, 0).getIntrinsicWidth() / 2);
    }

    public final void a(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        GradientDrawable gradientDrawable = this.c;
        gradientDrawable.setColors(iArr2);
        this.a.setBackground(gradientDrawable);
    }
}
