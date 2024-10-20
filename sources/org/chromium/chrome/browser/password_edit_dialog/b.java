package org.chromium.chrome.browser.password_edit_dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class b extends LinearLayout {
    public TextView a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
    }

    public void b(Callback callback) {
    }

    public void c(String str) {
    }

    public abstract void d(Callback callback);

    public abstract void e(String str, List list);

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.footer);
    }
}
