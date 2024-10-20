package defpackage;

import J.N;
import android.view.View;
import androidx.recyclerview.widget.d;
import org.chromium.components.browser_ui.contacts_picker.TopView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fu2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5411fu2 extends d implements View.OnClickListener {
    public final TopView z;

    public ViewOnClickListenerC5411fu2(TopView topView) {
        super(topView);
        this.z = topView;
        topView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TopView topView = this.z;
        topView.getClass();
        if (N.Mk6X8tWe("ContactsPickerSelectAll")) {
            topView.h.setChecked(!r2.isChecked());
        }
    }
}
