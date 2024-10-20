package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.WeakHashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.keyboard_accessory.data.UserInfoField;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ek2 */
/* loaded from: classes.dex */
public final class C0573Ek2 extends AbstractC5798h2 {
    public final int A;
    public final int z;

    @Override // defpackage.AbstractC5798h2
    public final void v(View view, Object obj) {
        C1791Nu1 c1791Nu1 = (C1791Nu1) obj;
        LinearLayout linearLayout = (LinearLayout) view;
        final TextView textView = (TextView) linearLayout.findViewById(R.id.suggestion_text);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.password_text);
        w(textView, (UserInfoField) c1791Nu1.c.get(0));
        w(textView2, (UserInfoField) c1791Nu1.c.get(1));
        XH0 xh0 = new XH0(textView.getContext());
        String str = c1791Nu1.a;
        Drawable b = xh0.b(str);
        int i = this.A;
        b.setBounds(0, 0, i, i);
        int i2 = this.z;
        textView.setCompoundDrawablePadding(i2);
        textView.setCompoundDrawablesRelative(b, null, null, null);
        xh0.a(new Callback() { // from class: Ck2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                Drawable drawable = (Drawable) obj2;
                C0573Ek2 c0573Ek2 = C0573Ek2.this;
                if (drawable != null) {
                    int i3 = c0573Ek2.A;
                    drawable.setBounds(0, 0, i3, i3);
                }
                int i4 = c0573Ek2.z;
                TextView textView3 = textView;
                textView3.setCompoundDrawablePadding(i4);
                textView3.setCompoundDrawablesRelative(drawable, null, null, null);
            }
        }, str);
        WeakHashMap weakHashMap = Ec4.a;
        textView.setPaddingRelative(i2, 0, i2, 0);
        textView2.setPaddingRelative((i2 * 2) + i, 0, i2, 0);
    }

    public C0573Ek2(RecyclerView recyclerView) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e0151, recyclerView);
        this.z = this.a.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a5);
        this.A = this.a.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a3);
    }

    public final void w(TextView textView, final UserInfoField userInfoField) {
        Drawable drawable = null;
        textView.setTransformationMethod(userInfoField.isObfuscated() ? new PasswordTransformationMethod() : null);
        textView.setGravity(((LocalizationUtils.isLayoutRtl() && userInfoField.isObfuscated()) ? 8388613 : 8388611) | 16);
        textView.setText(userInfoField.getDisplayText());
        textView.setContentDescription(userInfoField.getA11yDescription());
        textView.setOnClickListener(!userInfoField.isSelectable() ? null : new View.OnClickListener() { // from class: Dk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoField userInfoField2 = UserInfoField.this;
                Callback callback = userInfoField2.f;
                if (callback != null) {
                    callback.onResult(userInfoField2);
                }
            }
        });
        textView.setClickable(true);
        textView.setEnabled(userInfoField.isSelectable());
        if (userInfoField.isSelectable()) {
            TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(new int[]{R.attr.0_resource_name_obfuscated_res_0x7f0503f1});
            drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        }
        textView.setBackground(drawable);
    }
}
