package defpackage;

import android.widget.ListView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vP1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC10729vP1 implements Runnable {
    public final /* synthetic */ DialogC11072wP1 a;

    public RunnableC10729vP1(DialogC11072wP1 dialogC11072wP1) {
        this.a = dialogC11072wP1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListView listView = (ListView) this.a.findViewById(R.id.mr_chooser_list);
        if (listView != null) {
            EI2.d(listView.getCount(), "MediaRouter.Ui.Device.Count");
        }
    }
}
