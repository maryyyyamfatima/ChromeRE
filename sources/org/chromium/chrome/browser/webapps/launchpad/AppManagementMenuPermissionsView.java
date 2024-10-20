package org.chromium.chrome.browser.webapps.launchpad;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AppManagementMenuPermissionsView extends LinearLayout {
    public static final /* synthetic */ int j = 0;
    public ImageView a;
    public ImageView g;
    public ImageView h;
    public ImageView i;

    public AppManagementMenuPermissionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.notifications_button);
        this.g = (ImageView) findViewById(R.id.mic_button);
        this.h = (ImageView) findViewById(R.id.camera_button);
        this.i = (ImageView) findViewById(R.id.location_button);
    }
}
