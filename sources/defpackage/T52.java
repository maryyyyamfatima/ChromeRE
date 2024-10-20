package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import org.chromium.chrome.browser.content_creation.notes.NoteCreationDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T52 extends DK2 {
    public final /* synthetic */ C7616mK1 a;
    public final /* synthetic */ NoteCreationDialog g;

    public T52(NoteCreationDialog noteCreationDialog, C7616mK1 c7616mK1) {
        this.g = noteCreationDialog;
        this.a = c7616mK1;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.s;
        if (linearLayoutManager.O0() < 0) {
            return;
        }
        int O0 = linearLayoutManager.O0();
        int S0 = ((linearLayoutManager.S0() - O0) / 2) + O0;
        NoteCreationDialog noteCreationDialog = this.g;
        int i3 = noteCreationDialog.v0;
        if (i3 == S0) {
            return;
        }
        View T0 = noteCreationDialog.T0(i3);
        if (T0 != null) {
            T0.setElevation(0.0f);
        }
        noteCreationDialog.v0 = S0;
        noteCreationDialog.U0(((C7272lK1) this.a.get(S0)).b);
        int i4 = noteCreationDialog.v0;
        noteCreationDialog.y0++;
        View T02 = noteCreationDialog.T0(i4);
        if (T02 == null) {
            return;
        }
        T02.setElevation(noteCreationDialog.getActivity().getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080240));
    }
}
