package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MoreProgressButton extends FrameLayout implements View.OnClickListener {
    public View a;
    public View g;
    public Runnable h;
    public int i;

    public MoreProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = -1;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.action_button);
        this.g = findViewById;
        findViewById.setOnClickListener(this);
        this.a = findViewById(R.id.progress_spinner);
        a(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a(2);
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void a(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        this.g.setVisibility(1 == i ? 0 : 8);
        this.a.setVisibility(2 != i ? 8 : 0);
    }
}
