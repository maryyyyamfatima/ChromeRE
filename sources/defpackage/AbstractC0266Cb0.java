package defpackage;

import android.view.View;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.keyboard_accessory.data.UserInfoField;
import org.chromium.components.browser_ui.widget.chips.ChipView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0266Cb0 {
    public static void a(ChipView chipView, final UserInfoField userInfoField) {
        chipView.g.setText(userInfoField.getDisplayText());
        chipView.g.setContentDescription(userInfoField.getA11yDescription());
        chipView.setVisibility(userInfoField.getDisplayText().isEmpty() ? 8 : 0);
        if (!userInfoField.isSelectable()) {
            chipView.setEnabled(false);
            return;
        }
        chipView.setOnClickListener(new View.OnClickListener() { // from class: Bb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoField userInfoField2 = UserInfoField.this;
                Callback callback = userInfoField2.f;
                if (callback != null) {
                    callback.onResult(userInfoField2);
                }
            }
        });
        chipView.setClickable(true);
        chipView.setEnabled(true);
    }
}
