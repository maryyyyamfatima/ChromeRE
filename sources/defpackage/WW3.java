package defpackage;

import J.N;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.chrome.R;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.components.translate.TranslateMessage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class WW3 implements TC1, AdapterView.OnItemClickListener {
    public final VW3 a;
    public final XW3 g;
    public final View h;
    public final ListView i;
    public final LinkedList j;

    public WW3(Context context, TranslateMessage translateMessage, DataSetObserver dataSetObserver, TranslateMessage.MenuItem[] menuItemArr) {
        this.a = translateMessage;
        XW3 xw3 = new XW3(context, menuItemArr);
        this.g = xw3;
        xw3.registerDataSetObserver(dataSetObserver);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f55790_resource_name_obfuscated_res_0x7f0e0041, (ViewGroup) null);
        this.h = inflate;
        ListView listView = (ListView) inflate.findViewById(R.id.app_menu_list);
        this.i = listView;
        listView.setAdapter((ListAdapter) xw3);
        listView.setDivider(null);
        listView.setOnItemClickListener(this);
        this.j = new LinkedList();
    }

    @Override // defpackage.TC1
    public final View c() {
        return this.h;
    }

    @Override // defpackage.TC1
    public final void a(Runnable runnable) {
        this.j.add(runnable);
    }

    @Override // defpackage.TC1
    public final int b() {
        return AbstractC8540p04.a(this.g, this.i);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        XW3 xw3 = this.g;
        TranslateMessage.MenuItem menuItem = xw3.g[i];
        long j2 = ((TranslateMessage) this.a).d;
        TranslateMessage.MenuItem[] menuItemArr = j2 == 0 ? null : (TranslateMessage.MenuItem[]) N.MENF59pO(j2, menuItem.d, menuItem.e, menuItem.c);
        if (menuItemArr != null) {
            xw3.g = menuItemArr;
            xw3.notifyDataSetChanged();
        } else {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }
}
