package com.example.moviememberswork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviememberswork.databinding.ActivitySubmembersBinding

class submembers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySubmembersBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val profileList = arrayListOf(
            profiles(R.drawable.firstman, "이하철 (신하균)","어떤 그룹의 후계자 겸 초대형 규모의 이성 미술관의 관장 직위. 바람둥이같은 남자로 나온다. 역할은 호구.... 오프닝에서는 예니콜에게 낚이고 엔딩에서는 팹시에게 낚인다..."),
            profiles(R.drawable.grandma, "티파니 (예수정)","현재 태양의 눈물을 보관하고 있는 인물로, 웨이홍의 측근이라고 알려져 있다. 마카오에서 태양의 눈물을 팔려고 활동하고 있으나 세계적으로 알려진 보석이니 만큼 쉽지 만은 않은 듯. 거물의 측근 답게 씀씀이도 크고 활동도 잦으며 각국 언어에도 능통하다. 참고로 태양의 눈물은 티파니의 호텔방에 보관 중인데, 대형 금고 2개 중 한 곳에 들어있다. 보통 호텔 방에 있는 금고 레벨을 뛰어넘는 대형인데 그게 2 개라니, 역시 보통 사람은 아닌 듯."),
            profiles(R.drawable.bettingman, "조니 (증국상)","첸의 팀 소속으로 역시 총기 전문가. 아무리 홍콩이라지만 권총, 샷건은 물론 서브머신건까지 준비하는 것을 보면 보통내기는 아니다. 앤드류보다는 연하로 보이지만 껄떡대는 앤드류를 자제시키는(…) 역할을 담당한다. 포지션은 한국팀의 잠파노와 비슷해 보이지만 팀내 발언권은 잠파노보다 센 편. 솔직히 한국팀은 약간 그냥 봐도 콩가루로 보이는데 비해 중국팀은 그래도 서로에 대한 신뢰가 굳건하다. 경찰에 포위 당한 카지노를 탈출하기 위해 앤드류와 일차적으로 헤어진 후로는 나오지 않는다. "),
            profiles(R.drawable.smoker, "웨이홍 (기국서)","베일에 싸인 거물 범죄자. 홍콩 경찰에서 5년 째 수배 중이다. 동아시아의 거물 장물아비 중 한 명이며 동시에 무기밀매도 하고 있는 거물. 얼굴을 본 사람을 모두 죽이기 때문에 얼굴을 본 사람이 없으며, 손목에 나비 문신이 있다는 정도만 알려졌다. 현재 마카오에 있는 태양의 눈물은 최초 일본에 전시된 것이었으나 도둑 맞았고, 이를 입수한 것이 웨이홍이다. 한마디로 가지고 있는 물건을 도둑맞은 뒤 다시 사야 하는 상황. 암흑가에서는 다들 두려워할 정도의 악명을 지니고 있으며 소문에 의하면 처음 태양의 눈물을 훔친 도둑들 중 하나는 죽고, 남은 하나는 비참해졌다고 한다"),
            profiles(R.drawable.dalsoo, "앤드류 (오달수)","북경어와 영어를 능숙하게 구사하는 자칭 서울 불광동 출신 남자. 첸의 팀에 속해 있으며 역시 총기 사용에 능하다. 작중에서는 개그를 담당하고 있으며 가장 웃음을 주는 캐릭터다. 여자에게 상당히 껄떡대는 편이며 그 중에서도 예니콜에게 수시로 들이댄다. 한국인이지만 작중 내내 계속 '한국놈 못 믿는다'는 말을 해대는 것을 보면 조선족이라는 설이 있지만 본인 왈 서울대병원 출신 불광동 본적이라나. 어쨌건 광동어를 못해서 팀 내에서 약간 갈굼받는 처지.앤드류라는 이름은 앤드류 왕자에서 따왔다고 한다.\n"),
            profiles(R.drawable.foxface, "사모님 (채국희)","홍콩 접선 시 마카오 박과 함께 나타난 제보자. 티파니의 행보에 대해 상세히 알려준다. 티파니와는 배 다른 자매 사이"),
            profiles(R.drawable.police, "한국 반장 (주진모)","뽀빠이를 아는 것으로 볼 때 오래 전부터 이들을 추적한 걸로 추정된다.\n")


            )

        binding.rvProfile.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProfile.setHasFixedSize(true)

        binding.rvProfile.adapter = profileAdapter(profileList)


    }
}