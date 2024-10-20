package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.chrome.R;
import org.chromium.chrome.browser.ui.tablet.emptybackground.incognitotoggle.IncognitoToggleButtonTablet;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hk1 */
/* loaded from: classes2.dex */
public abstract class AbstractC0962Hk1 extends ChromeImageButton {
    public InterfaceC10590uz3 i;
    public C0832Gk1 j;

    public AbstractC0962Hk1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setScaleType(ImageView.ScaleType.CENTER);
    }

    public final void d() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.i;
        if (interfaceC10590uz3 == null || ((AbstractC11276wz3) interfaceC10590uz3).g() == null) {
            return;
        }
        setContentDescription(getContext().getString(((AbstractC11276wz3) this.i).o() ? R.string.0_resource_name_obfuscated_res_0x7f14017b : R.string.0_resource_name_obfuscated_res_0x7f14017c));
        ((IncognitoToggleButtonTablet) this).setImageResource(((AbstractC11276wz3) this.i).o() ? R.drawable.0_resource_name_obfuscated_res_0x7f090373 : R.drawable.0_resource_name_obfuscated_res_0x7f0900d7);
    }
}
