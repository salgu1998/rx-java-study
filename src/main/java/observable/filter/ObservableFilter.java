package observable.filter;

import io.reactivex.Observable;
import log.LogType;
import log.Logger;

import java.util.List;

/**
 * 조건에 맞는 값만 통지
 */
public class ObservableFilter {
    public static void main(String[] args) {
        List<String> name = List.of("lee", "kim", "park", "choi", "lerer", "lol");

        Observable.fromIterable(name)
                .filter(nameEl -> nameEl.contains("l"))
                .filter(nameEl -> nameEl.contains("e"))
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
