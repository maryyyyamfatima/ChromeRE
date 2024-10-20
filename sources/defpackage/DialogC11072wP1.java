package defpackage;

import J.N;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.android.chrome.R;
import org.chromium.components.media_router.BrowserMediaRouterDialogController;
import org.chromium.components.media_router.MediaRouteChooserDialogManager$Fragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wP1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC11072wP1 extends DialogC9357rP1 {
    public final /* synthetic */ MediaRouteChooserDialogManager$Fragment t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC11072wP1(MediaRouteChooserDialogManager$Fragment mediaRouteChooserDialogManager$Fragment, Context context, int i) {
        super(context, i);
        this.t = mediaRouteChooserDialogManager$Fragment;
    }

    @Override // defpackage.DialogC9357rP1, defpackage.DialogC0805Gf, defpackage.DialogC8536p00, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        if (listView != null) {
            final MediaRouteChooserDialogManager$Fragment mediaRouteChooserDialogManager$Fragment = this.t;
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: uP1
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    int i2 = MediaRouteChooserDialogManager$Fragment.w0;
                    MediaRouteChooserDialogManager$Fragment mediaRouteChooserDialogManager$Fragment2 = MediaRouteChooserDialogManager$Fragment.this;
                    mediaRouteChooserDialogManager$Fragment2.getClass();
                    DQ1 dq1 = (DQ1) adapterView.getItemAtPosition(i);
                    if (dq1 == null || !dq1.g) {
                        return;
                    }
                    TR1 a = TR1.a(dq1);
                    AbstractC1015Hv abstractC1015Hv = mediaRouteChooserDialogManager$Fragment2.u0;
                    BrowserMediaRouterDialogController browserMediaRouterDialogController = abstractC1015Hv.d;
                    browserMediaRouterDialogController.b = null;
                    N.MUhSLnzh(browserMediaRouterDialogController.a, browserMediaRouterDialogController, abstractC1015Hv.a, a.a);
                    mediaRouteChooserDialogManager$Fragment2.v0 = true;
                    mediaRouteChooserDialogManager$Fragment2.L0(false, false);
                }
            });
            new Handler().postDelayed(new RunnableC10729vP1(this), 3000L);
        }
    }
}
