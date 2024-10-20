package org.chromium.chrome.browser.download.settings;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.chrome.R;
import defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadLocationPreferenceDialog extends AbstractDialogInterfaceOnClickListenerC10927vy2 {
    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2
    public final void T0(boolean z) {
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2
    public final void S0(View view) {
        ((ListView) view.findViewById(R.id.location_preference_list_view)).setAdapter((ListAdapter) ((DownloadLocationPreference) R0()).Z);
        super.S0(view);
    }
}
