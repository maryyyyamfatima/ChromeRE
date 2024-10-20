package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1177Jb1 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC1177Jb1() {
        attachInterface(this, "android.widget.directwriting.IDirectWritingServiceCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        int i3;
        C7744mi1 c7744mi1;
        View a;
        InputMethodManager inputMethodManager;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.widget.directwriting.IDirectWritingServiceCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.widget.directwriting.IDirectWritingServiceCallback");
            return true;
        }
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
        } else if (i == 2) {
            parcel2.writeNoException();
        } else if (i == 11) {
            parcel.readFloat();
            parcel.readFloat();
            parcel2.writeNoException();
        } else if (i == 91) {
            parcel.readInt();
            BinderC9838so0 binderC9838so0 = (BinderC9838so0) this;
            PointF pointF = binderC9838so0.k == null ? new PointF() : new PointF(binderC9838so0.k);
            parcel2.writeNoException();
            AbstractC1307Kb1.b(parcel2, pointF);
        } else if (i == 901) {
            parcel.readString();
            Bundle bundle = (Bundle) AbstractC1307Kb1.a(parcel, Bundle.CREATOR);
            parcel2.writeNoException();
            AbstractC1307Kb1.b(parcel2, bundle);
        } else if (i != 902) {
            switch (i) {
                case 21:
                    CharSequence charSequence = (CharSequence) AbstractC1307Kb1.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR);
                    int readInt = parcel.readInt();
                    HandlerC9495ro0 handlerC9495ro0 = ((BinderC9838so0) this).m;
                    Message obtainMessage = handlerC9495ro0.obtainMessage(101);
                    obtainMessage.obj = charSequence;
                    obtainMessage.arg1 = readInt;
                    handlerC9495ro0.sendMessage(obtainMessage);
                    parcel2.writeNoException();
                    break;
                case 22:
                    parcel2.writeNoException();
                    break;
                case 23:
                    parcel.readInt();
                    parcel2.writeNoException();
                    break;
                default:
                    switch (i) {
                        case 31:
                            int i4 = ((BinderC9838so0) this).g;
                            parcel2.writeNoException();
                            parcel2.writeInt(i4);
                            break;
                        case 32:
                            int i5 = ((BinderC9838so0) this).h;
                            parcel2.writeNoException();
                            parcel2.writeInt(i5);
                            break;
                        case 33:
                            parcel.readFloat();
                            parcel.readFloat();
                            parcel2.writeNoException();
                            parcel2.writeInt(0);
                            break;
                        case 34:
                            String str2 = ((BinderC9838so0) this).i;
                            str = str2 != null ? str2 : "";
                            parcel2.writeNoException();
                            parcel2.writeInt(1);
                            TextUtils.writeToParcel(str, parcel2, 1);
                            break;
                        case 35:
                            parcel2.writeNoException();
                            parcel2.writeInt(0);
                            break;
                        default:
                            switch (i) {
                                case 41:
                                    parcel2.writeNoException();
                                    parcel2.writeInt(0);
                                    break;
                                case 42:
                                    parcel2.writeNoException();
                                    parcel2.writeInt(0);
                                    break;
                                case 43:
                                    parcel2.writeNoException();
                                    parcel2.writeInt(0);
                                    break;
                                case 44:
                                    parcel2.writeNoException();
                                    parcel2.writeInt(0);
                                    break;
                                case 45:
                                    parcel2.writeNoException();
                                    parcel2.writeInt(0);
                                    break;
                                case 46:
                                    parcel2.writeNoException();
                                    parcel2.writeInt(0);
                                    break;
                                case 47:
                                    parcel2.writeNoException();
                                    parcel2.writeInt(0);
                                    break;
                                case 48:
                                    Rect rect = ((BinderC9838so0) this).j;
                                    i3 = rect != null ? rect.right : 0;
                                    parcel2.writeNoException();
                                    parcel2.writeInt(i3);
                                    break;
                                case 49:
                                    Rect rect2 = ((BinderC9838so0) this).j;
                                    i3 = rect2 != null ? rect2.left : 0;
                                    parcel2.writeNoException();
                                    parcel2.writeInt(i3);
                                    break;
                                case 50:
                                    Rect rect3 = ((BinderC9838so0) this).j;
                                    i3 = rect3 != null ? rect3.top : 0;
                                    parcel2.writeNoException();
                                    parcel2.writeInt(i3);
                                    break;
                                case 51:
                                    Rect rect4 = ((BinderC9838so0) this).j;
                                    i3 = rect4 != null ? rect4.bottom : 0;
                                    parcel2.writeNoException();
                                    parcel2.writeInt(i3);
                                    break;
                                case 52:
                                    parcel2.writeNoException();
                                    parcel2.writeInt(0);
                                    break;
                                case 53:
                                    parcel2.writeNoException();
                                    parcel2.writeInt(0);
                                    break;
                                case 54:
                                    parcel2.writeNoException();
                                    parcel2.writeInt(0);
                                    break;
                                default:
                                    switch (i) {
                                        case 71:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 72:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeFloat(0.0f);
                                            break;
                                        case 73:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeFloat(0.0f);
                                            break;
                                        case 74:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 75:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 76:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 77:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 78:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 79:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 80:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 81:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 82:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 83:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 84:
                                            parcel.readInt();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(0);
                                            break;
                                        case 85:
                                            parcel.readInt();
                                            Rect rect5 = new Rect(0, 0, 0, 0);
                                            parcel2.writeNoException();
                                            AbstractC1307Kb1.b(parcel2, rect5);
                                            break;
                                        default:
                                            switch (i) {
                                                case 101:
                                                    EditorInfo editorInfo = ((BinderC9838so0) this).a;
                                                    str = editorInfo != null ? editorInfo.privateImeOptions : "";
                                                    parcel2.writeNoException();
                                                    parcel2.writeString(str);
                                                    break;
                                                case 102:
                                                    EditorInfo editorInfo2 = ((BinderC9838so0) this).a;
                                                    i3 = editorInfo2 != null ? editorInfo2.imeOptions : 0;
                                                    parcel2.writeNoException();
                                                    parcel2.writeInt(i3);
                                                    break;
                                                case 103:
                                                    EditorInfo editorInfo3 = ((BinderC9838so0) this).a;
                                                    i3 = editorInfo3 != null ? editorInfo3.inputType : 0;
                                                    parcel2.writeNoException();
                                                    parcel2.writeInt(i3);
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 111:
                                                            int readInt2 = parcel.readInt();
                                                            HandlerC9495ro0 handlerC9495ro02 = ((BinderC9838so0) this).m;
                                                            Message obtainMessage2 = handlerC9495ro02.obtainMessage(201);
                                                            obtainMessage2.arg1 = readInt2;
                                                            handlerC9495ro02.sendMessage(obtainMessage2);
                                                            parcel2.writeNoException();
                                                            break;
                                                        case 112:
                                                            String readString = parcel.readString();
                                                            Bundle bundle2 = (Bundle) AbstractC1307Kb1.a(parcel, Bundle.CREATOR);
                                                            BinderC9838so0 binderC9838so02 = (BinderC9838so0) this;
                                                            if (bundle2 != null && (c7744mi1 = binderC9838so02.l) != null && (a = c7744mi1.a()) != null && (inputMethodManager = (InputMethodManager) a.getContext().getSystemService("input_method")) != null) {
                                                                inputMethodManager.sendAppPrivateCommand(a, readString, bundle2);
                                                                if (bundle2.getBoolean("showKeyboard")) {
                                                                    HandlerC9495ro0 handlerC9495ro03 = binderC9838so02.m;
                                                                    handlerC9495ro03.sendMessage(handlerC9495ro03.obtainMessage(301));
                                                                }
                                                            }
                                                            parcel2.writeNoException();
                                                            break;
                                                        case 113:
                                                            HandlerC9495ro0 handlerC9495ro04 = ((BinderC9838so0) this).m;
                                                            handlerC9495ro04.sendMessage(handlerC9495ro04.obtainMessage(302));
                                                            parcel2.writeNoException();
                                                            break;
                                                        default:
                                                            return super.onTransact(i, parcel, parcel2, i2);
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            String readString2 = parcel.readString();
            Bundle bundle3 = (Bundle) AbstractC1307Kb1.a(parcel, Bundle.CREATOR);
            HandlerC9495ro0 handlerC9495ro05 = ((BinderC9838so0) this).m;
            Message obtainMessage3 = handlerC9495ro05.obtainMessage(401);
            obtainMessage3.obj = readString2;
            obtainMessage3.setData(bundle3);
            handlerC9495ro05.sendMessage(obtainMessage3);
            parcel2.writeNoException();
            AbstractC1307Kb1.b(parcel2, bundle3);
        }
        return true;
    }
}
