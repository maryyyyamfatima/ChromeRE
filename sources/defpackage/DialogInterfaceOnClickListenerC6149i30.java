package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Map;
import org.chromium.chrome.browser.browsing_data.ConfirmImportantSitesDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i30 */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC6149i30 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConfirmImportantSitesDialogFragment a;

    public DialogInterfaceOnClickListenerC6149i30(ConfirmImportantSitesDialogFragment confirmImportantSitesDialogFragment) {
        this.a = confirmImportantSitesDialogFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ConfirmImportantSitesDialogFragment confirmImportantSitesDialogFragment = this.a;
        if (i == -1) {
            Intent intent = new Intent();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry : confirmImportantSitesDialogFragment.u0.entrySet()) {
                Integer num = (Integer) confirmImportantSitesDialogFragment.s0.get(entry.getKey());
                if (((Boolean) entry.getValue()).booleanValue()) {
                    arrayList3.add((String) entry.getKey());
                    arrayList4.add(num);
                } else {
                    arrayList.add((String) entry.getKey());
                    arrayList2.add(num);
                }
            }
            intent.putExtra("DeselectedDomains", (String[]) arrayList.toArray(new String[0]));
            intent.putExtra("DeselectedDomainReasons", AbstractC9048qW.b(arrayList2));
            intent.putExtra("IgnoredDomains", (String[]) arrayList3.toArray(new String[0]));
            intent.putExtra("IgnoredDomainReasons", AbstractC9048qW.b(arrayList4));
            confirmImportantSitesDialogFragment.R(true).d0(confirmImportantSitesDialogFragment.S(), -1, intent);
            return;
        }
        confirmImportantSitesDialogFragment.R(true).d0(confirmImportantSitesDialogFragment.S(), 0, confirmImportantSitesDialogFragment.getActivity().getIntent());
    }
}
