package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.chrome.R;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.password_manager.AccountChooserDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC10947w2 implements View.OnClickListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ C11290x2 g;

    public ViewOnClickListenerC10947w2(C11290x2 c11290x2, String str) {
        this.g = c11290x2;
        this.a = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AccountChooserDialog accountChooserDialog = this.g.a;
        String MR6Af3ZS = N.MR6Af3ZS(this.a, 0);
        accountChooserDialog.getClass();
        Context context = view.getContext();
        Resources resources = context.getResources();
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.f58710_resource_name_obfuscated_res_0x7f0e017e, (ViewGroup) null);
        textView.setText(MR6Af3ZS);
        textView.announceForAccessibility(MR6Af3ZS);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int width = view.getLayoutDirection() == 1 ? iArr[0] : (iArr[0] + view.getWidth()) - textView.getMeasuredWidth();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = ((iArr[1] - resources.getDimensionPixelSize(R.dimen.f39010_resource_name_obfuscated_res_0x7f0806b0)) - (identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0)) - textView.getMeasuredHeight();
        int i = view.getLayoutDirection() == 1 ? 8388613 : 8388611;
        FrameLayout frameLayout = SysUtils.isLowEndDevice() ? new FrameLayout(new XN3(context)) : null;
        Toast c = C9225r04.d().c(context);
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            frameLayout.addView(textView, -2, -2);
            c.setView(frameLayout);
        } else {
            c.setView(textView);
        }
        c.setGravity(c.getGravity(), c.getXOffset(), c.getYOffset() + ZN3.c);
        c.setGravity(i | 48, width, dimensionPixelSize);
        c.setDuration(0);
        c.show();
    }
}
