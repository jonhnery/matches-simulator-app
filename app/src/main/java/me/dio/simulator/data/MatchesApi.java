package me.dio.simulator.data;

import retrofit2.Call;

import java.util.List;

import me.dio.simulator.domain.Match;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}
