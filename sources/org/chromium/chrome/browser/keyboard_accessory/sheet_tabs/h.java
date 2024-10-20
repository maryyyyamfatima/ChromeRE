package org.chromium.chrome.browser.keyboard_accessory.sheet_tabs;

import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC5798h2;
import defpackage.C10475ug;
import defpackage.C1791Nu1;
import defpackage.T34;
import defpackage.XH0;
import defpackage.ZE;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.keyboard_accessory.data.UserInfoField;
import org.chromium.components.browser_ui.widget.chips.ChipView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class h extends AbstractC5798h2 {
    public String z;

    @Override // defpackage.AbstractC5798h2
    public final void v(View view, Object obj) {
        final C1791Nu1 c1791Nu1 = (C1791Nu1) obj;
        final PasswordAccessoryInfoView passwordAccessoryInfoView = (PasswordAccessoryInfoView) view;
        w(passwordAccessoryInfoView.h, (UserInfoField) c1791Nu1.c.get(0));
        w(passwordAccessoryInfoView.i, (UserInfoField) c1791Nu1.c.get(1));
        passwordAccessoryInfoView.a.setVisibility(c1791Nu1.d ? 8 : 0);
        TextView textView = passwordAccessoryInfoView.a;
        String str = c1791Nu1.a;
        textView.setText(T34.o(str).replaceFirst("/$", ""));
        this.z = str;
        XH0 xh0 = new XH0(passwordAccessoryInfoView.getContext());
        Drawable b = xh0.b(str);
        int dimensionPixelSize = passwordAccessoryInfoView.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a3);
        b.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        passwordAccessoryInfoView.g.setImageDrawable(b);
        xh0.a(new Callback() { // from class: org.chromium.chrome.browser.keyboard_accessory.sheet_tabs.g
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                Drawable drawable = (Drawable) obj2;
                h hVar = h.this;
                hVar.getClass();
                if (c1791Nu1.a.equals(hVar.z)) {
                    PasswordAccessoryInfoView passwordAccessoryInfoView2 = passwordAccessoryInfoView;
                    int dimensionPixelSize2 = passwordAccessoryInfoView2.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a3);
                    if (drawable != null) {
                        drawable.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
                    }
                    passwordAccessoryInfoView2.g.setImageDrawable(drawable);
                }
            }
        }, str);
    }

    public h(RecyclerView recyclerView) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e0154, recyclerView);
    }

    public final void w(ChipView chipView, final UserInfoField userInfoField) {
        chipView.g.setTransformationMethod(userInfoField.isObfuscated() ? new PasswordTransformationMethod() : null);
        C10475ug c10475ug = chipView.g;
        c10475ug.setText(userInfoField.getDisplayText());
        c10475ug.setContentDescription(userInfoField.getA11yDescription());
        chipView.setOnClickListener(userInfoField.isSelectable() ? new View.OnClickListener() { // from class: yk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoField userInfoField2 = UserInfoField.this;
                Callback callback = userInfoField2.f;
                if (callback != null) {
                    callback.onResult(userInfoField2);
                }
            }
        } : null);
        chipView.setClickable(userInfoField.isSelectable());
        chipView.setEnabled(userInfoField.isSelectable());
    }
}
