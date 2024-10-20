package org.chromium.chrome.browser.browsing_data;

import android.app.ActivityManager;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C5490g8;
import defpackage.C6835k30;
import defpackage.C9892sx1;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.DialogInterfaceOnClickListenerC6149i30;
import defpackage.V60;
import defpackage.Wn4;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ConfirmImportantSitesDialogFragment extends DialogInterfaceOnCancelListenerC7423lm0 {
    public String[] r0;
    public String[] t0;
    public C6835k30 v0;
    public LargeIconBridge w0;
    public ListView x0;
    public final HashMap s0 = new HashMap();
    public final HashMap u0 = new HashMap();

    @Override // androidx.fragment.app.c
    public final void E0(Bundle bundle) {
        super.E0(bundle);
        this.r0 = bundle.getStringArray("ImportantDomains");
        this.t0 = bundle.getStringArray("FaviconURLs");
        int[] intArray = bundle.getIntArray("ImportantDomainReasons");
        int i = 0;
        while (true) {
            String[] strArr = this.r0;
            if (i >= strArr.length) {
                return;
            }
            this.s0.put(strArr[i], Integer.valueOf(intArray[i]));
            this.u0.put(this.r0[i], Boolean.TRUE);
            i++;
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        LargeIconBridge largeIconBridge = this.w0;
        if (largeIconBridge != null) {
            largeIconBridge.a();
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            this.r0 = new String[0];
            this.t0 = new String[0];
            L0(false, false);
        }
        this.w0 = new LargeIconBridge(Profile.d());
        int min = Math.min((((ActivityManager) V60.a.getSystemService("activity")).getMemoryClass() / 16) * 25 * 1024, 102400);
        LargeIconBridge largeIconBridge = this.w0;
        largeIconBridge.getClass();
        largeIconBridge.c = new C9892sx1(min);
        this.v0 = new C6835k30(this, this.r0, this.t0, N());
        DialogInterfaceOnClickListenerC6149i30 dialogInterfaceOnClickListenerC6149i30 = new DialogInterfaceOnClickListenerC6149i30(this);
        HashSet a = Wn4.a.a();
        String[] strArr = this.r0;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (a.contains(strArr[i])) {
                z = true;
                break;
            }
            i++;
        }
        int i2 = z ? R.string.0_resource_name_obfuscated_res_0x7f140525 : R.string.0_resource_name_obfuscated_res_0x7f140524;
        int i3 = z ? R.string.0_resource_name_obfuscated_res_0x7f140340 : R.string.0_resource_name_obfuscated_res_0x7f14033f;
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0086, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(R.id.select_dialog_listview);
        this.x0 = listView;
        listView.setAdapter((ListAdapter) this.v0);
        this.x0.setOnItemClickListener(this.v0);
        ((TextView) inflate.findViewById(R.id.message)).setText(i3);
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g8.i(i2);
        c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f14033e, dialogInterfaceOnClickListenerC6149i30);
        c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f1402f4, dialogInterfaceOnClickListenerC6149i30);
        c5490g8.a.q = inflate;
        return c5490g8.a();
    }
}
