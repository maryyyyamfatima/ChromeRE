package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OE {
    public static final String[] g = {"PLAY", "LOAD", "PAUSE", "SEEK", "STOP_MEDIA", "MEDIA_SET_VOLUME", "MEDIA_GET_STATUS", "EDIT_TRACKS_INFO", "QUEUE_LOAD", "QUEUE_INSERT", "QUEUE_UPDATE", "QUEUE_REMOVE", "QUEUE_REORDER"};
    public static final String[] h = {"pause", "seek", "stream_volume", "stream_mute"};
    public static final Object i = new Object();
    public static HashMap j;
    public final TH d;
    public final KE e;
    public final SparseArray a = new SparseArray();
    public final C4317ck b = new C4317ck();
    public final ArrayDeque c = new ArrayDeque();
    public final Handler f = new Handler();

    public final void a(String str, String str2) {
        Iterator it = this.e.i.keySet().iterator();
        while (it.hasNext()) {
            g((String) it.next(), -1, str, str2);
        }
    }

    public OE(KE ke, TH th) {
        this.e = ke;
        this.d = th;
        synchronized (i) {
            if (j == null) {
                HashMap hashMap = new HashMap();
                j = hashMap;
                hashMap.put("STOP_MEDIA", "STOP");
                j.put("MEDIA_SET_VOLUME", "SET_VOLUME");
                j.put("MEDIA_GET_STATUS", "GET_STATUS");
            }
        }
    }

    public final boolean c(JSONObject jSONObject) {
        String string = jSONObject.getString("clientId");
        if (string != null) {
            TH th = this.d;
            if (th.g()) {
                if (!th.f().equals(jSONObject.getString("message"))) {
                    return false;
                }
                KE ke = this.e;
                GU gu = (GU) ke.i.get(string);
                if (gu == null) {
                    return false;
                }
                int optInt = jSONObject.optInt("sequenceNumber", -1);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", "leave_session");
                jSONObject2.put("sequenceNumber", optInt);
                jSONObject2.put("timeoutMillis", 0);
                jSONObject2.put("clientId", string);
                ke.y(string, jSONObject2.toString());
                ArrayList arrayList = new ArrayList();
                Iterator it = ke.i.values().iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    GU gu2 = (GU) it.next();
                    String str = gu.c;
                    boolean equals = "tab_and_origin_scoped".equals(str);
                    String str2 = gu.d;
                    if ((!equals || !VH.b(gu2.d, str2) || gu2.e != gu.e) && (!"origin_scoped".equals(str) || !VH.b(gu2.d, str2))) {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(gu2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ke.t(((GU) it2.next()).a, null);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3 A[Catch: IllegalStateException -> 0x009e, IOException -> 0x00a0, TryCatch #2 {IOException -> 0x00a0, IllegalStateException -> 0x009e, blocks: (B:22:0x0080, B:24:0x0086, B:26:0x0090, B:28:0x0096, B:32:0x00a5, B:33:0x00ad, B:35:0x00b3, B:37:0x00bd, B:39:0x00c3, B:40:0x00ca, B:42:0x00d0, B:44:0x00de), top: B:21:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(org.json.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OE.d(org.json.JSONObject):boolean");
    }

    public final boolean h(JSONObject jSONObject, String str, String str2, int i2) {
        if (!this.d.g()) {
            return false;
        }
        e(jSONObject);
        if (i2 != -1) {
            int optInt = jSONObject.optInt("requestId", 0);
            if (optInt == 0) {
                synchronized (EH.b) {
                    if (EH.c == null) {
                        EH.c = new EH();
                    }
                }
                EH eh = EH.c;
                int i3 = eh.a;
                if (i3 == 0) {
                    eh.a = i3 + 1;
                }
                int i4 = eh.a;
                eh.a = i4 + 1;
                jSONObject.put("requestId", i4);
                optInt = i4;
            }
            this.a.append(optInt, new NE(str2, i2));
        }
        return j(jSONObject.toString(), i2, str, str2);
    }

    public final void i(TR1 tr1, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("label", tr1.a);
            jSONObject.put("friendlyName", tr1.b);
            jSONObject.put("capabilities", k(this.d.d()));
            jSONObject.put("volume", (Object) null);
            jSONObject.put("isActiveInput", (Object) null);
            jSONObject.put("displayStatus", (Object) null);
            jSONObject.put("receiverType", "cast");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("receiver", jSONObject);
            jSONObject2.put("action", str2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", "receiver_action");
            jSONObject3.put("sequenceNumber", -1);
            jSONObject3.put("timeoutMillis", 0);
            jSONObject3.put("clientId", str);
            jSONObject3.put("message", jSONObject2);
            this.e.y(str, jSONObject3.toString());
        } catch (JSONException e) {
            AbstractC4851eH1.a("CafMR", "Failed to send receiver action message", e);
        }
    }

    public final void g(String str, int i2, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str2);
            jSONObject.put("sequenceNumber", i2);
            jSONObject.put("timeoutMillis", 0);
            jSONObject.put("clientId", str);
        } catch (JSONException e) {
            AbstractC4851eH1.a("CafMR", "Failed to build the reply: " + e, new Object[0]);
        }
        if (str3 != null && !"remove_session".equals(str2) && !"disconnect_session".equals(str2)) {
            JSONObject jSONObject2 = new JSONObject(str3);
            if ("v2_message".equals(str2) && "MEDIA_STATUS".equals(jSONObject2.getString("type"))) {
                f(jSONObject2);
            }
            jSONObject.put("message", jSONObject2);
            this.e.y(str, jSONObject.toString());
        }
        jSONObject.put("message", str3);
        this.e.y(str, jSONObject.toString());
    }

    public final String b() {
        TH th = this.d;
        if (!th.g()) {
            return "{}";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            QH qh = th.a;
            C8136nq1 c8136nq1 = qh.g;
            jSONObject.put("level", (c8136nq1 == null || !c8136nq1.k()) ? 0.0d : qh.g.w);
            QH qh2 = th.a;
            C8136nq1 c8136nq12 = qh2.g;
            jSONObject.put("muted", c8136nq12 != null && c8136nq12.k() && qh2.g.x);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("label", th.a.i.s1());
            jSONObject2.put("friendlyName", th.a.i.i);
            jSONObject2.put("capabilities", k(th.d()));
            jSONObject2.put("volume", jSONObject);
            QH qh3 = th.a;
            C8136nq1 c8136nq13 = qh3.g;
            jSONObject2.put("isActiveInput", (c8136nq13 == null || !c8136nq13.k()) ? -1 : qh3.g.y);
            String str = null;
            jSONObject2.put("displayStatus", (Object) null);
            jSONObject2.put("receiverType", "cast");
            JSONArray jSONArray = new JSONArray();
            Iterator it = th.f.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("name", str2);
                jSONArray.put(jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sessionId", th.f());
            QH qh4 = th.a;
            C8136nq1 c8136nq14 = qh4.g;
            if (c8136nq14 != null && c8136nq14.k()) {
                str = qh4.g.v;
            }
            jSONObject4.put("statusText", str);
            jSONObject4.put("receiver", jSONObject2);
            jSONObject4.put("namespaces", jSONArray);
            jSONObject4.put("media", k(new ArrayList()));
            jSONObject4.put("status", "connected");
            jSONObject4.put("transportId", "web-4");
            ApplicationMetadata g2 = th.a.g();
            if (g2 != null) {
                jSONObject4.put("appId", g2.a);
            } else {
                jSONObject4.put("appId", th.c.a.a());
            }
            jSONObject4.put("displayName", th.a.i.i);
            return jSONObject4.toString();
        } catch (JSONException e) {
            AbstractC4851eH1.f("CafMR", "Building session message failed", e);
            return "{}";
        }
    }

    public final void f(JSONObject jSONObject) {
        TH th = this.d;
        jSONObject.put("sessionId", th.f());
        JSONArray jSONArray = jSONObject.getJSONArray("status");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            jSONObject2.put("sessionId", th.f());
            if (jSONObject2.has("supportedMediaCommands")) {
                JSONArray jSONArray2 = new JSONArray();
                int i3 = jSONObject2.getInt("supportedMediaCommands");
                for (int i4 = 0; i4 < 4; i4++) {
                    if (((1 << i4) & i3) != 0) {
                        jSONArray2.put(h[i4]);
                    }
                }
                jSONObject2.put("supportedMediaCommands", jSONArray2);
            }
        }
    }

    public static void e(Object obj) {
        JSONObject jSONObject;
        JSONArray names;
        int i2 = 0;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            while (i2 < jSONArray.length()) {
                e(jSONArray.get(i2));
                i2++;
            }
            return;
        }
        if (!(obj instanceof JSONObject) || (names = (jSONObject = (JSONObject) obj).names()) == null) {
            return;
        }
        while (i2 < names.length()) {
            String string = names.getString(i2);
            if (jSONObject.isNull(string)) {
                jSONObject.remove(string);
            } else {
                e(jSONObject.get(string));
            }
            i2++;
        }
    }

    public static JSONArray k(ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [IH] */
    /* JADX WARN: Type inference failed for: r1v1, types: [JH] */
    public final boolean j(String str, final int i2, String str2, final String str3) {
        BasePendingResult basePendingResult;
        TH th = this.d;
        if (!th.g()) {
            return false;
        }
        C8136nq1 c8136nq1 = th.a.g;
        if (c8136nq1 == null) {
            Status status = new Status(17, null, 0);
            basePendingResult = new C1489Ll3(Looper.getMainLooper());
            basePendingResult.a(status);
        } else {
            AF3 n = c8136nq1.n(str2, str);
            final ?? r0 = new InterfaceC8624pF3() { // from class: IH
                @Override // defpackage.InterfaceC8624pF3
                public final Status a(Object obj) {
                    return new Status(0, null, 0);
                }
            };
            final ?? r1 = new InterfaceC8624pF3() { // from class: JH
                @Override // defpackage.InterfaceC8624pF3
                public final Status a(Object obj) {
                    return (Status) obj;
                }
            };
            final C8281oF3 c8281oF3 = new C8281oF3(r1);
            InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: mF3
                @Override // defpackage.InterfaceC7371ld2
                public final void a(Object obj) {
                    C8281oF3.this.a(r0.a(obj));
                }
            };
            n.getClass();
            n.f(AbstractC10681vF3.a, interfaceC7371ld2);
            n.c(new InterfaceC2872Wc2() { // from class: nF3
                @Override // defpackage.InterfaceC2872Wc2
                public final void c(Exception exc) {
                    Status status2 = new Status(8, "unknown error", 0);
                    if (exc instanceof C10114td) {
                        C10114td c10114td = (C10114td) exc;
                        status2 = new Status(c10114td.a.g, c10114td.getMessage(), 0);
                    }
                    C8281oF3.this.a(r1.a(status2));
                }
            });
            basePendingResult = c8281oF3;
        }
        if (TextUtils.equals(str2, "urn:x-cast:com.google.cast.media")) {
            return true;
        }
        basePendingResult.l(new RP2() { // from class: LE
            @Override // defpackage.RP2
            public final void c(QP2 qp2) {
                Status status2 = (Status) qp2;
                OE oe = OE.this;
                oe.getClass();
                if (!status2.r1()) {
                    AbstractC4851eH1.a("CafMR", "Failed to send the message: " + status2, new Object[0]);
                    return;
                }
                oe.g(str3, i2, "app_message", null);
            }
        });
        return true;
    }
}
