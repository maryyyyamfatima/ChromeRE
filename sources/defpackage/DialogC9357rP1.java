package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC9357rP1 extends DialogC0805Gf {
    public final MQ1 j;
    public final C8329oP1 k;
    public TextView l;
    public C6614jQ1 m;
    public ArrayList n;
    public C8672pP1 o;
    public ListView p;
    public boolean q;
    public long r;
    public final HandlerC7985nP1 s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogC9357rP1(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.view.ContextThemeWrapper r2 = androidx.mediarouter.app.f.a(r3, r2, r0)
            int r3 = androidx.mediarouter.app.f.b(r2)
            r1.<init>(r2, r3)
            jQ1 r2 = defpackage.C6614jQ1.c
            r1.m = r2
            nP1 r2 = new nP1
            r2.<init>(r1)
            r1.s = r2
            android.content.Context r2 = r1.getContext()
            MQ1 r2 = defpackage.MQ1.d(r2)
            r1.j = r2
            oP1 r2 = new oP1
            r2.<init>(r1)
            r1.k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DialogC9357rP1.<init>(android.content.Context, int):void");
    }

    public final void f(C6614jQ1 c6614jQ1) {
        if (c6614jQ1 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.m.equals(c6614jQ1)) {
            return;
        }
        this.m = c6614jQ1;
        if (this.q) {
            MQ1 mq1 = this.j;
            C8329oP1 c8329oP1 = this.k;
            mq1.j(c8329oP1);
            mq1.a(c6614jQ1, c8329oP1, 1);
        }
        e();
    }

    @Override // defpackage.DialogC0805Gf, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.l.setText(charSequence);
    }

    @Override // defpackage.DialogC0805Gf, android.app.Dialog
    public final void setTitle(int i) {
        this.l.setText(i);
    }

    @Override // defpackage.DialogC0805Gf, defpackage.DialogC8536p00, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f58830_resource_name_obfuscated_res_0x7f0e0190);
        this.n = new ArrayList();
        this.o = new C8672pP1(getContext(), this.n);
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        this.p = listView;
        listView.setAdapter((ListAdapter) this.o);
        this.p.setOnItemClickListener(this.o);
        this.p.setEmptyView(findViewById(android.R.id.empty));
        this.l = (TextView) findViewById(R.id.mr_chooser_title);
        getWindow().setLayout(VP1.a(getContext()), -2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
        this.j.a(this.m, this.k, 1);
        e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.q = false;
        this.j.j(this.k);
        this.s.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public final void e() {
        if (this.q) {
            this.j.getClass();
            ArrayList arrayList = new ArrayList(MQ1.f());
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                DQ1 dq1 = (DQ1) arrayList.get(i);
                if (!(!dq1.d() && dq1.g && dq1.h(this.m))) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, C9015qP1.a);
            if (SystemClock.uptimeMillis() - this.r < 300) {
                HandlerC7985nP1 handlerC7985nP1 = this.s;
                handlerC7985nP1.removeMessages(1);
                handlerC7985nP1.sendMessageAtTime(handlerC7985nP1.obtainMessage(1, arrayList), this.r + 300);
            } else {
                this.r = SystemClock.uptimeMillis();
                this.n.clear();
                this.n.addAll(arrayList);
                this.o.notifyDataSetChanged();
            }
        }
    }
}
